.class final Lz0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz0/l;

    invoke-direct {v0}, Lz0/l;-><init>()V

    sput-object v0, Lz0/l;->a:Lz0/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)J
    .locals 1

    invoke-static {p1, p2}, Lz0/j;->a(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {p1, p2}, Lz0/k;->a(Landroid/view/MotionEvent;I)F

    move-result p1

    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method
