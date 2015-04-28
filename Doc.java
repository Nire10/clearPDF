public class Doc
{
    private String baseName;
    private int outType;
    private String workFolder;
    private int pageCount;

    //constructor
    public Doc(String workfolder)
    {
        workFolder = workfolder;
    }

    public void doDoc(String name)
    {
        //sends the doc, basename, and workfolder. returns an array(???) of words [Type?]
        PreProcess prep = new PreProcess(workFolder);
        wordList = prep.preProcessDoc(baseName);

        //sends the words to structure the page. 
        ProcessStructure procstru = new ProcessStructure(workFolder);
        
        //sends the finished doc to be cleaned up. return value???
        procstru.processStructureDoc(x);
        PostProcess postp = new PostProcess();
    }
}
