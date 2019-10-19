import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TaskOne {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String numbers = reader.readLine();


            int[][] nums = {{0, 8},
                    {1, 2, 4},
                    {2, 1, 3, 5},
                    {3, 2, 6},
                    {4, 1, 5, 7},
                    {5, 2, 4, 6, 8},
                    {6, 3, 5, 9},
                    {7, 4, 8},
                    {8, 5, 7, 9, 0},
                    {9, 6, 8}};


            switch (numbers.length()) {
                case 1:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
//                        System.out.println(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]));
                        list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]));
                    } break;

                case 2:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
//                            System.out.println(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
//                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]));
                            list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]));
                        }
                    }break;

                case 3:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
                            for (int k = 0; k < nums[Character.getNumericValue(numbers.charAt(2))].length; k++) {
                                list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                        Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]) +
                                        Integer.toString(nums[Character.getNumericValue(numbers.charAt(2))][k]));
                            }
                        }
                    } break;

                case 4:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
                            for (int k = 0; k < nums[Character.getNumericValue(numbers.charAt(2))].length; k++) {
                                for (int l = 0; l < nums[Character.getNumericValue(numbers.charAt(3))].length; l++) {
                                    list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]) +
                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(2))][k]) +
                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(3))][l]));
                                }
                            }
                        }

                    } break;

                case 5:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
                            for (int k = 0; k < nums[Character.getNumericValue(numbers.charAt(2))].length; k++) {
                                for (int l = 0; l < nums[Character.getNumericValue(numbers.charAt(3))].length; l++) {
                                    for (int m = 0; m < nums[Character.getNumericValue(numbers.charAt(4))].length; m++) {
                                    list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                             Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]) +
                                             Integer.toString(nums[Character.getNumericValue(numbers.charAt(2))][k]) +
                                             Integer.toString(nums[Character.getNumericValue(numbers.charAt(3))][l]) +
                                             Integer.toString(nums[Character.getNumericValue(numbers.charAt(4))][m]));
                                }
                            }
                        }
                    }
                }break;

                case 6:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
                            for (int k = 0; k < nums[Character.getNumericValue(numbers.charAt(2))].length; k++) {
                                for (int l = 0; l < nums[Character.getNumericValue(numbers.charAt(3))].length; l++) {
                                    for (int m = 0; m < nums[Character.getNumericValue(numbers.charAt(4))].length; m++) {
                                        for (int n = 0; n < nums[Character.getNumericValue(numbers.charAt(5))].length; n++) {
                                            list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(2))][k]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(3))][l]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(4))][m]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(5))][n]));
                                        }
                                    }
                                }
                            }
                        }
                    } break;

                case 7:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
                            for (int k = 0; k < nums[Character.getNumericValue(numbers.charAt(2))].length; k++) {
                                for (int l = 0; l < nums[Character.getNumericValue(numbers.charAt(3))].length; l++) {
                                    for (int m = 0; m < nums[Character.getNumericValue(numbers.charAt(4))].length; m++) {
                                        for (int n = 0; n < nums[Character.getNumericValue(numbers.charAt(5))].length; n++) {
                                            for (int s = 0; s < nums[Character.getNumericValue(numbers.charAt(6))].length; s++) {
                                            list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(2))][k]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(3))][l]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(4))][m]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(5))][n]) +
                                                    Integer.toString(nums[Character.getNumericValue(numbers.charAt(6))][s]));
                                        }
                                    }
                                }
                            }
                            }
                        }
                    }break;




                case 8:
                    for (int i = 0; i < nums[Character.getNumericValue(numbers.charAt(0))].length; i++) {
                        for (int j = 0; j < nums[Character.getNumericValue(numbers.charAt(1))].length; j++) {
                            for (int k = 0; k < nums[Character.getNumericValue(numbers.charAt(2))].length; k++) {
                                for (int l = 0; l < nums[Character.getNumericValue(numbers.charAt(3))].length; l++) {
                                    for (int m = 0; m < nums[Character.getNumericValue(numbers.charAt(4))].length; m++) {
                                        for (int n = 0; n < nums[Character.getNumericValue(numbers.charAt(5))].length; n++) {
                                            for (int s = 0; s < nums[Character.getNumericValue(numbers.charAt(6))].length; s++) {
                                                for (int g = 0; g < nums[Character.getNumericValue(numbers.charAt(7))].length; g++) {
                                                    list.add(Integer.toString(nums[Character.getNumericValue(numbers.charAt(0))][i]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(1))][j]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(2))][k]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(3))][l]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(4))][m]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(5))][n]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(6))][s]) +
                                                            Integer.toString(nums[Character.getNumericValue(numbers.charAt(7))][g]));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } break;




            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list);
        String x = list.toString();

        System.out.println(x.substring(1,x.length() - 1) );




    }

}
