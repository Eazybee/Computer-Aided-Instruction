package computeraidedinstruction;

public class Letters
{
    private String name;
    private String dir;
    
    public Letters() {
    }
    
    public Letters(final String name, final String dir) {
        this.name = name;
        this.dir = dir;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setDir(final String dir) {
        this.dir = dir;
    }
    
    public String getDir() {
        return this.dir;
    }
    
    @Override
    public String toString() {
        return this.name + " " + this.dir;
    }
}
