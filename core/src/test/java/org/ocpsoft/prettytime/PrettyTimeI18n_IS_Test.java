/*
 * Copyright 2012 <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ocpsoft.prettytime;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.ocpsoft.prettytime.PrettyTime;

/**
 * @author Gudmundur Agust
 */
public class PrettyTimeI18n_IS_Test
{
   private Locale locale;
   private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
   
   private static final String JUST_NOW = "rétt í þessu";
   private static final String JUST_NOW_FUTURE = "rétt í þessu";   //alternatives: "eftir um mínútu", "rétt bráðum", "rétt strax", "eftir augnablik", "rétt í þessu"
   private static final String JUST_NOW_PAST = "rétt áðan"; //alternatives: "fyrir um mínútu", "rétt áðan", "fyrir andartaki síðan", "fyrir augnabliki síðan", "rétt í þessu", "núna"

   @Before
   public void setUp() throws Exception
   {
      locale = new Locale("is");
   }

   @Test
   public void testPrettyTime()
   {
	  Date now = new Date();
      PrettyTime p = new PrettyTime(now, locale);
      assertEquals(JUST_NOW, p.format(now));
   }

   @Test
   public void testPrettyTimeCenturies()
   {
      PrettyTime p = new PrettyTime(new Date(3155692597470L * 3L), locale);
      assertEquals("fyrir 3 öldum", p.format(new Date(0)));

      p = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 aldir", p.format(new Date(3155692597470L * 3L)));
   }

   @Test
   public void testCeilingInterval() throws Exception
   {
      Date then = format.parse("20/5/2009");
      Date ref = format.parse("17/6/2009");
      PrettyTime t = new PrettyTime(ref, locale);
      assertEquals("fyrir 1 mánuði", t.format(then));
   }

   @Test(expected = IllegalArgumentException.class)
   public void testNullDate() throws Exception
   {
      PrettyTime t = new PrettyTime(locale);
      Date date = null;
      assertEquals(JUST_NOW, t.format(date));
   }

   @Test
   public void testRightNow() throws Exception
   {
	  Date now = new Date();
      PrettyTime t = new PrettyTime(now,locale);
      assertEquals(JUST_NOW, t.format(now));
   }
   
   /*
    * Future
    */

   @Test
   public void testRightNowVariance() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals(JUST_NOW_FUTURE, t.format(new Date(600)));
   }
   
   /*
    * Future plural
    */

   @Test
   public void testMinutesFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 12 mínútur", t.format(new Date(1000 * 60 * 12)));
   }

   @Test
   public void testHoursFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 tíma", t.format(new Date(1000 * 60 * 60 * 3)));
   }

   @Test
   public void testDaysFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 daga", t.format(new Date(1000 * 60 * 60 * 24 * 3)));
   }

   @Test
   public void testWeeksFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 vikur", t.format(new Date(1000 * 60 * 60 * 24 * 7 * 3)));
   }

   @Test
   public void testMonthsFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 mánuði", t.format(new Date(2629743830L * 3L)));
   }

   @Test
   public void testYearsFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 ár", t.format(new Date(2629743830L * 12L * 3L)));
   }

   @Test
   public void testDecadesFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 áratugi", t.format(new Date(315569259747L * 3L)));
   }

   @Test
   public void testCenturiesFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 3 aldir", t.format(new Date(3155692597470L * 3L)));
   }
   
   /*
    * Future singular
    */
   
   @Test
   public void testMinuteFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals(JUST_NOW_FUTURE, t.format(new Date(1000 * 60 * 1)));
   }

   @Test
   public void testHourFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 tíma", t.format(new Date(1000 * 60 * 60 * 1)));
   }

   @Test
   public void testDayFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 dag", t.format(new Date(1000 * 60 * 60 * 24 * 1)));
   }

   @Test
   public void testWeekFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 viku", t.format(new Date(1000 * 60 * 60 * 24 * 7 * 1)));
   }

   @Test
   public void testMonthFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 mánuð", t.format(new Date(2629743830L * 1L)));
   }

   @Test
   public void testYearFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 ár", t.format(new Date(2629743830L * 12L * 1L)));
   }

   @Test
   public void testDecadeFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 áratug", t.format(new Date(315569259747L * 1L)));
   }

   @Test
   public void testCenturyFromNow() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 1 öld", t.format(new Date(3155692597470L * 1L)));
   }
   
   
   /*
    * Future singular: special case when (duration mod 10 == 1 && duration != 11)
    */

   @Test
   public void testMinuteFromNowMod10() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 21 mínútu", t.format(new Date(1000 * 60 * 21)));
   }
   
   @Test
   public void testMinuteFromNow11() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 11 mínútur", t.format(new Date(1000 * 60 * 11)));
   }

   @Test
   public void testHourFromNowMod10() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 21 tíma", t.format(new Date(1000 * 60 * 60 * 21))); // or "eftir 21 klukkustund"
   }
   
   @Test
   public void testHourFromNow11() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 11 tíma", t.format(new Date(1000 * 60 * 60 * 11)));  // or "eftir 11 klukkustundir"
   }

   @Test
   public void testMillenniumFromNowMod10() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 21 þúsund ár", t.format(new Date(3155692597470L * 10 * 21L)));
   }
   
   @Test
   public void testMillenniumFromNow11() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(0), locale);
      assertEquals("eftir 11 þúsund ár", t.format(new Date(3155692597470L * 10 * 11L)));
   }
   
   

   /*
    * Past 
    */
   @Test
   public void testMomentsAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(6000), locale);
      assertEquals(JUST_NOW_PAST, t.format(new Date(0)));
   }
   
   /*
    * Past plural
    */

   @Test
   public void testMinutesAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 12), locale);
      assertEquals("fyrir 12 mínútum", t.format(new Date(0)));
   }

   @Test
   public void testHoursAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 3), locale);
      assertEquals("fyrir 3 tímum", t.format(new Date(0)));
   }

   @Test
   public void testDaysAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 24 * 3), locale);
      assertEquals("fyrir 3 dögum", t.format(new Date(0)));
   }

   @Test
   public void testWeeksAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 24 * 7 * 3), locale);
      assertEquals("fyrir 3 vikum", t.format(new Date(0)));
   }

   @Test
   public void testMonthsAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(2629743830L * 3L), locale);
      assertEquals("fyrir 3 mánuðum", t.format(new Date(0)));
   }

   @Test
   public void testYearsAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(2629743830L * 12L * 3L), locale);
      assertEquals("fyrir 3 árum", t.format(new Date(0)));
   }

   @Test
   public void testDecadesAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(315569259747L * 3L), locale);
      assertEquals("fyrir 3 áratugum", t.format(new Date(0)));
   }

   @Test
   public void testCenturiesAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(3155692597470L * 3L), locale);
      assertEquals("fyrir 3 öldum", t.format(new Date(0)));
   }
   

   /*
    * Past singular
    */
   
   @Test
   public void testMinuteAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 1), locale);
      assertEquals(JUST_NOW_PAST, t.format(new Date(0)));
   }
   
   @Test
   public void testHourAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 1), locale);
      assertEquals("fyrir 1 tíma", t.format(new Date(0)));
   }

   @Test
   public void testDayAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 24 * 1), locale);
      assertEquals("fyrir 1 degi", t.format(new Date(0)));
   }

   @Test
   public void testWeekAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 24 * 7 * 1), locale);
      assertEquals("fyrir 1 viku", t.format(new Date(0)));
   }

   @Test
   public void testMonthAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(2629743830L * 1L), locale);
      assertEquals("fyrir 1 mánuði", t.format(new Date(0)));
   }

   @Test
   public void testYearAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(2629743830L * 12L * 1L), locale);
      assertEquals("fyrir 1 ári", t.format(new Date(0)));
   }

   @Test
   public void testDecadeAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(315569259747L * 1L), locale);
      assertEquals("fyrir 1 áratugi", t.format(new Date(0)));
   }

   @Test
   public void testCenturyAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(3155692597470L * 1L), locale);
      assertEquals("fyrir 1 öld", t.format(new Date(0)));
   }
   
   @Test
   public void testMillenniumAgo() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(3155692597470L * 10 * 1L), locale);
      assertEquals("fyrir 1 þúsund árum", t.format(new Date(0)));
   }
   
   
   /*
    * Past singular: special case when (duration mod 10 == 1 && duration != 11)
    */

   @Test
   public void testMinuteAgoMod10() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 21), locale);
      assertEquals("fyrir 21 mínútu", t.format(new Date(0)));
   }

   @Test
   public void testMinuteAgo11() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 11), locale);
      assertEquals("fyrir 11 mínútum", t.format(new Date(0)));
   }
   
   @Test
   public void testHourAgoMod10() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 21), locale);
      assertEquals("fyrir 21 tíma", t.format(new Date(0)));
   }

   @Test
   public void testHourAgo11() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(1000 * 60 * 60 * 11), locale);
      assertEquals("fyrir 11 tímum", t.format(new Date(0)));
   }
   
   @Test
   public void testMillenniumAgoMod10() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(3155692597470L * 10 * 21L), locale);
      assertEquals("fyrir 21 þúsund árum", t.format(new Date(0)));  // or "fyrir 21 þúsundi ára"
   }
   
   @Test
   public void testMillenniumAgo11() throws Exception
   {
      PrettyTime t = new PrettyTime(new Date(3155692597470L * 10 * 11L), locale);
      assertEquals("fyrir 11 þúsund árum", t.format(new Date(0)));
   }
   
   
}