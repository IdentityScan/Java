class GamesTitles
{
	class Soundtrack
	{
		String titleNamesSound;
		public Soundtrack()
		{
			titleNamesSound = "Forest Temple";
		}
	}

	class Control
	{
		void showInformation()
		{
			Soundtrack st = new Soundtrack();
			System.out.println(st.titleNamesSound);
		}
	}
}


public class TwoSubClassInner
{
	public static void main (String[]args)
	{
		GamesTitles gt = new GamesTitles();
		GamesTitles.Soundtrack sound = gt.new Soundtrack();
		GamesTitles.Control ctl = gt.new Control();

		System.out.println(sound.titleNamesSound);

		ctl.showInformation();

	}
}
