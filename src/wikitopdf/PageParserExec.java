package wikitopdf;

import wikitopdf.utils.ByteFormatter;
import wikitopdf.utils.WikiLogger;

/**
 *
 * @author Denis Lunev <den.lunev@gmail.com>
 */
public class PageParserExec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
        //WikiProcessor wikiProcessor = new WikiProcessor();
        //WikiHDProcessor wikiProcessor = new WikiHDProcessor();
        WikiThreadingProcessor wikiProcessor = new WikiThreadingProcessor();
        wikiProcessor.createPdf();
         }catch(Exception ex){
            WikiLogger.getLogger().severe(ex.getMessage());
        }catch(Error th){
            WikiLogger.getLogger().severe(th.getMessage() + " memory:" + 
               ByteFormatter.format(Runtime.getRuntime().freeMemory()));
        }catch(Throwable ex0){
            WikiLogger.getLogger().severe(ex0.getMessage());
        }
    }
}
