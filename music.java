static File Fight = new File("fight.wav");
	static File Overworld = new File("Overworld.wav");
	static File song = Overworld;
	static Clip clip;
  
  static void ChangeSong(File newSong) 
	{
		if(song != newSong) {clip.stop();
		song = newSong;
		PlaySound();
		}
	}

	static void PlaySound() 
	{
		try 
		{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(song));
			clip.start();
			clip.loop(999); //A lot
		}catch(Exception e) 
		{

		}
	}
  
  if() 
					{
						ChangeSong(Deaths_Glare);
					} else
					{

						ChangeSong(Menu_Song);
					}
          
          
         PlaySound();