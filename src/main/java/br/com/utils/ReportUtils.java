package br.com.utils;

import java.util.List;
import org.springframework.stereotype.Component;
import ExtentCucumberFormatter.*;
	/**
	 * Classe utilit�ria para formata��o de textos exibidos no relat�rio dos testes.
	 */
	@Component
	public class ReportUtils {

		private ReportUtils() {
		     
		}
		
		static StringBuilder formatStepName(String step) {
			StringBuilder builder = new StringBuilder();

			builder.append("<b>");
			builder.append(step);
			builder.append("</b><br><br>");
			return builder;
		}

		public static void report(String step, StringBuilder message) {
			StringBuilder builder = formatStepName(step);
			builder.append(message);
			//ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
			
		}

		public static void report(String step, String message) {
			StringBuilder builder = formatStepName(step);
			builder.append(message);
			//ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
		}

		public static void report(String step, Object obj) {

			//JacksonJsonHelper jsonHelper = new JacksonJsonHelper();
			StringBuilder builder = formatStepName(step);
			builder.append("<b> " + obj.getClass().getSimpleName() + ": </b>");
			//builder.append(jsonHelper.writeWithDefaultDateFormatIgnoringNullFields(obj));
			//ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
		}

		public static <T> void report(String step, List<T> list) {
			StringBuilder builder = formatStepName(step);
			
			//JacksonJsonHelper jsonHelper = new JacksonJsonHelper();
			list.forEach(l -> {
				builder.append("<b> " + list.get(0).getClass().getSimpleName() + ": </b>");
				//builder.append(jsonHelper.writeWithDefaultDateFormatIgnoringNullFields(l));
				builder.append("<br><br>");
			});
			//ExtentCucumberFormatter.setStepDetailsMessage(builder.toString());
		}
	}
