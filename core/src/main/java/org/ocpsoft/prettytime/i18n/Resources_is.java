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
package org.ocpsoft.prettytime.i18n;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeFormat;
import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.format.SimpleTimeFormat;
import org.ocpsoft.prettytime.impl.TimeFormatProvider;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Minute;

/**
 *
 * @author Gudmundur Agust
 */
public class Resources_is extends ListResourceBundle implements TimeFormatProvider{
       private static final Object[][] OBJECTS = new Object[][] {
					          { "CenturyPattern", "%n %u" },
					          { "CenturyFuturePrefix", "eftir " },
					          { "CenturyFutureSuffix", "" },
					          { "CenturyPastPrefix", "fyrir " },
					          { "CenturyPastSuffix", "" },
					          { "CenturyPastSingularName", "öld" },
					          { "CenturyPastPluralName", "öldum" },
					          { "CenturyFutureSingularName", "öld" },
					          { "CenturyFuturePluralName", "aldir" },
					          { "DayPattern", "%n %u" },
					          { "DayFuturePrefix", "eftir " },
					          { "DayFutureSuffix", "" },
					          { "DayPastPrefix", "fyrir " },
					          { "DayPastSuffix", "" },
					          { "DayPastSingularName", "degi" },
					          { "DayPastPluralName", "dögum" },
					          { "DayFutureSingularName", "dag" },
					          { "DayFuturePluralName", "daga" },
					          { "DecadePattern", "%n %u" },
					          { "DecadeFuturePrefix", "eftir " },
					          { "DecadeFutureSuffix", "" },
					          { "DecadePastPrefix", "fyrir " },
					          { "DecadePastSuffix", "" },
					          { "DecadePastSingularName", "áratugi" },
					          { "DecadePastPluralName", "áratugum" },
					          { "DecadeFutureSingularName", "áratug" },
					          { "DecadeFuturePluralName", "áratugi" },
					          { "HourPattern", "%n %u" },
					          { "HourFuturePrefix", "eftir " },
					          { "HourFutureSuffix", "" },
					          { "HourPastPrefix", "fyrir " },
					          { "HourPastSuffix", "" },
					          { "HourPastSingularName", "tíma" },
					          { "HourPastPluralName", "tímum" },
					          { "HourFutureSingularName", "tíma" },
					          { "HourFuturePluralName", "tíma" },
					          { "JustNowPattern", "%u" },
					          { "JustNowFuturePrefix", "rétt í þessu" },
					          { "JustNowFutureSuffix", "" },
					          { "JustNowPastPrefix", "rétt áðan" },
					          { "JustNowPastSuffix", "" },
					          { "JustNowSingularName", "" },
					          { "JustNowPluralName", "" },
					          { "MillenniumPattern", "%n %u" },
					          { "MillenniumFuturePrefix", "eftir " },
					          { "MillenniumFutureSuffix", "" },
					          { "MillenniumPastPrefix", "fyrir " },
					          { "MillenniumPastSuffix", "" },
					          { "MillenniumPastSingularName", "þúsund árum" },
					          { "MillenniumPastPluralName", "þúsund árum" },
					          { "MillenniumFutureSingularName", "þúsund ár" },
					          { "MillenniumFuturePluralName", "þúsund ár" },
					          { "MillisecondPattern", "%n %u" },
					          { "MillisecondFuturePrefix", "eftir " },
					          { "MillisecondFutureSuffix", "" },
					          { "MillisecondPastPrefix", "fyrir " },
					          { "MillisecondPastSuffix", "" },
					          { "MillisecondPastSingularName", "millisekúndu" },
					          { "MillisecondPastPluralName", "millisekúndum" },
					          { "MillisecondFutureSingularName", "millisekúndu" },
					          { "MillisecondFuturePluralName", "millisekúndur" },
					          { "MinutePattern", "%n %u" },
					          { "MinuteFuturePrefix", "eftir " },
					          { "MinuteFutureSuffix", "" },
					          { "MinutePastPrefix", "fyrir " },
					          { "MinutePastSuffix", "" },
					          { "MinutePastSingularName", "mínútu" },
					          { "MinutePastPluralName", "mínútum" },
					          { "MinuteFutureSingularName", "mínútu" },
					          { "MinuteFuturePluralName", "mínútur" },
					          { "MonthPattern", "%n %u" },
					          { "MonthFuturePrefix", "eftir " },
					          { "MonthFutureSuffix", "" },
					          { "MonthPastPrefix", "fyrir " },
					          { "MonthPastSuffix", "" },
					          { "MonthPastSingularName", "mánuði" },
					          { "MonthPastPluralName", "mánuðum" },
					          { "MonthFutureSingularName", "mánuð" },
					          { "MonthFuturePluralName", "mánuði" },
					          { "SecondPattern", "%n %u" },
					          { "SecondFuturePrefix", "eftir " },
					          { "SecondFutureSuffix", "" },
					          { "SecondPastPrefix", "fyrir " },
					          { "SecondPastSuffix", "" },
					          { "SecondPastSingularName", "sekúndu" },
					          { "SecondPastPluralName", "sekúndum" },
					          { "SecondFutureSingularName", "sekúndu" },
					          { "SecondFuturePluralName", "sekúndur" },
					          { "WeekPattern", "%n %u" },
					          { "WeekFuturePrefix", "eftir " },
					          { "WeekFutureSuffix", "" },
					          { "WeekPastPrefix", "fyrir " },
					          { "WeekPastSuffix", "" },
					          { "WeekPastSingularName", "viku" },
					          { "WeekPastPluralName", "vikum" },
					          { "WeekFutureSingularName", "viku" },
					          { "WeekFuturePluralName", "vikur" },
					          { "YearPattern", "%n %u" },
					          { "YearFuturePrefix", "eftir " },
					          { "YearFutureSuffix", "" },
					          { "YearPastPrefix", "fyrir " },
					          { "YearPastSuffix", "" },
					          { "YearPastSingularName", "ári" },
					          { "YearPastPluralName", "árum" },
					          { "YearFutureSingularName", "ár" },
					          { "YearFuturePluralName", "ár" },
					          { "AbstractTimeUnitPattern", "" },
					          { "AbstractTimeUnitFuturePrefix", "" },
					          { "AbstractTimeUnitFutureSuffix", "" },
					          { "AbstractTimeUnitPastPrefix", "" },
					          { "AbstractTimeUnitPastSuffix", "" },
					          { "AbstractTimeUnitSingularName", "" },
					          { "AbstractTimeUnitPluralName", "" } };
   
   @Override
   public Object[][] getContents()
   {
       return OBJECTS;
   }
   
   @Override
   public TimeFormat getFormatFor(TimeUnit t) 
   {
	   if(t instanceof Minute || t instanceof Hour || t instanceof Millennium){
	      return new IsTimeFormat(this, t);
	   }
	   return null;
   }
   
   public class IsTimeFormat extends SimpleTimeFormat {
  
	   public IsTimeFormat(ResourceBundle bundle, TimeUnit unit)
	   {
		  super();
		  setPattern(bundle.getString(getUnitName(unit) + "Pattern"));
		  setFuturePrefix(bundle.getString(getUnitName(unit) + "FuturePrefix"));
		  setFutureSuffix(bundle.getString(getUnitName(unit) + "FutureSuffix"));
		  setPastPrefix(bundle.getString(getUnitName(unit) + "PastPrefix"));
		  setPastSuffix(bundle.getString(getUnitName(unit) + "PastSuffix"));
		
		  setSingularName(bundle.getString(getUnitName(unit) + "SingularName"));
		  setPluralName(bundle.getString(getUnitName(unit) + "PluralName"));
		 
		  setFuturePluralName(bundle.getString(getUnitName(unit) + "FuturePluralName"));
		  setFutureSingularName((bundle.getString(getUnitName(unit) + "FutureSingularName")));
		  setPastPluralName((bundle.getString(getUnitName(unit) + "PastPluralName")));
		  setPastSingularName((bundle.getString(getUnitName(unit) + "PastSingularName")));

	   }
   
   	   private String getUnitName(TimeUnit unit) 
   	   {
		  return unit.getClass().getSimpleName();
	   }
   	   
	   protected String getGramaticallyCorrectName(final Duration d, boolean round)
	   {
	      String result = getPluralName(d);
	      if ((Math.abs(getQuantity(d, round)) % 10 == 1) && Math.abs(getQuantity(d, round)) != 11)
	      {
	         result = getSingularName(d);
	      }
	      return result;
	   }
	   
   }

}
