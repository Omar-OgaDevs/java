public class Song {

  private String title;
  private double duration;

  //Constructor
  public Song(String title, double duration) {
    this.title = title;
    this.duration = duration;
  }
  //Getter for title
  public String getTitle() {
    return title;
  }   
  //Return to String (to output the contents of an actual object)
  @Override
  public String toString() {    
    return this.title + ": " + this.duration;
  }
  

}
