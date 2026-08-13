.class public abstract Ln5/F$e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/F$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ln5/F$e;
.end method

.method public abstract b(Ln5/F$e$a;)Ln5/F$e$b;
.end method

.method public abstract c(Ljava/lang/String;)Ln5/F$e$b;
.end method

.method public abstract d(Z)Ln5/F$e$b;
.end method

.method public abstract e(Ln5/F$e$c;)Ln5/F$e$b;
.end method

.method public abstract f(Ljava/lang/Long;)Ln5/F$e$b;
.end method

.method public abstract g(Ljava/util/List;)Ln5/F$e$b;
.end method

.method public abstract h(Ljava/lang/String;)Ln5/F$e$b;
.end method

.method public abstract i(I)Ln5/F$e$b;
.end method

.method public abstract j(Ljava/lang/String;)Ln5/F$e$b;
.end method

.method public k([B)Ln5/F$e$b;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Ln5/F;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v0}, Ln5/F$e$b;->j(Ljava/lang/String;)Ln5/F$e$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract l(Ln5/F$e$e;)Ln5/F$e$b;
.end method

.method public abstract m(J)Ln5/F$e$b;
.end method

.method public abstract n(Ln5/F$e$f;)Ln5/F$e$b;
.end method
