.class public final LH9/C$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/C;
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

    invoke-direct {p0}, LH9/C$a;-><init>()V

    return-void
.end method

.method public static synthetic c(LH9/C$a;[BLH9/w;ILjava/lang/Object;)LH9/C;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LH9/C$a;->b([BLH9/w;)LH9/C;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LX9/f;LH9/w;J)LH9/C;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH9/C$a$a;

    invoke-direct {v0, p2, p3, p4, p1}, LH9/C$a$a;-><init>(LH9/w;JLX9/f;)V

    return-object v0
.end method

.method public final b([BLH9/w;)LH9/C;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LX9/d;

    invoke-direct {v0}, LX9/d;-><init>()V

    invoke-virtual {v0, p1}, LX9/d;->t1([B)LX9/d;

    move-result-object v0

    array-length p1, p1

    int-to-long v1, p1

    invoke-virtual {p0, v0, p2, v1, v2}, LH9/C$a;->a(LX9/f;LH9/w;J)LH9/C;

    move-result-object p1

    return-object p1
.end method
