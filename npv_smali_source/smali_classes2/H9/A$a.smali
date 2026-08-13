.class public final LH9/A$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LH9/A$a;-><init>()V

    return-void
.end method

.method public static synthetic b(LH9/A$a;[BLH9/w;IIILjava/lang/Object;)LH9/A;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    array-length p4, p1

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, LH9/A$a;->a([BLH9/w;II)LH9/A;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a([BLH9/w;II)LH9/A;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p3

    int-to-long v5, p4

    invoke-static/range {v1 .. v6}, LI9/d;->l(JJJ)V

    new-instance v0, LH9/A$a$a;

    invoke-direct {v0, p2, p4, p1, p3}, LH9/A$a$a;-><init>(LH9/w;I[BI)V

    return-object v0
.end method
