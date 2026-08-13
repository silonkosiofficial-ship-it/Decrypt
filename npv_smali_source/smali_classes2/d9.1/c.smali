.class public final Ld9/c;
.super Ld9/f;
.source "SourceFile"


# static fields
.field public static final K:Ld9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld9/c;

    invoke-direct {v0}, Ld9/c;-><init>()V

    sput-object v0, Ld9/c;->K:Ld9/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    sget v1, Ld9/j;->c:I

    sget v2, Ld9/j;->d:I

    sget-wide v3, Ld9/j;->e:J

    sget-object v5, Ld9/j;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ld9/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method

.method public x1(ILjava/lang/String;)LW8/J;
    .locals 1

    .prologue
    invoke-static {p1}, Lb9/l;->a(I)V

    sget v0, Ld9/j;->c:I

    if-lt p1, v0, :cond_0

    invoke-static {p0, p2}, Lb9/l;->b(LW8/J;Ljava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, LW8/J;->x1(ILjava/lang/String;)LW8/J;

    move-result-object p1

    return-object p1
.end method
