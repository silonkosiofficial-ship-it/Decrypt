.class final Ld9/k;
.super LW8/J;
.source "SourceFile"


# static fields
.field public static final E:Ld9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld9/k;

    invoke-direct {v0}, Ld9/k;-><init>()V

    sput-object v0, Ld9/k;->E:Ld9/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LW8/J;-><init>()V

    return-void
.end method


# virtual methods
.method public t1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Ld9/c;->K:Ld9/c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Ld9/f;->B1(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method

.method public u1(Lm7/i;Ljava/lang/Runnable;)V
    .locals 1

    sget-object p1, Ld9/c;->K:Ld9/c;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0, v0}, Ld9/f;->B1(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public x1(ILjava/lang/String;)LW8/J;
    .locals 1

    .prologue
    invoke-static {p1}, Lb9/l;->a(I)V

    sget v0, Ld9/j;->d:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p2}, Lb9/l;->b(LW8/J;Ljava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, LW8/J;->x1(ILjava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1
.end method
