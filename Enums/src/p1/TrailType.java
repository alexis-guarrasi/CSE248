package p1;

public enum TrailType {
	POINT_TO_POINT, OUT_AND_BACK, LOOP;
	
	public enum Level {
	    POINT_TO_POINT{
	        @Override
	        public String asLowerCase() {
	            return POINT_TO_POINT.toString().toLowerCase();
	        }
	    },
	    OUT_AND_BACK{
	        @Override
	        public String asLowerCase() {
	            return OUT_AND_BACK.toString().toLowerCase();
	        }
	    },
	    LOOP{
	        @Override
	        public String asLowerCase() {
	            return LOOP.toString().toLowerCase();
	        }
	    };

	    public abstract String asLowerCase();
	}
}
