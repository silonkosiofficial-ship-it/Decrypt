.class public abstract LW/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW/d$a;,
        LW/d$b;,
        LW/d$c;,
        LW/d$d;,
        LW/d$e;,
        LW/d$f;,
        LW/d$g;,
        LW/d$h;,
        LW/d$i;,
        LW/d$j;,
        LW/d$k;,
        LW/d$l;,
        LW/d$m;,
        LW/d$n;,
        LW/d$o;,
        LW/d$p;,
        LW/d$q;,
        LW/d$r;,
        LW/d$s;,
        LW/d$t;,
        LW/d$u;,
        LW/d$v;,
        LW/d$w;,
        LW/d$x;,
        LW/d$y;,
        LW/d$z;,
        LW/d$A;,
        LW/d$B;,
        LW/d$C;,
        LW/d$D;,
        LW/d$E;,
        LW/d$F;,
        LW/d$G;,
        LW/d$H;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LW/d;->a:I

    iput p2, p0, LW/d;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IIILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LW/d;-><init>(IILy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(IILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LW/d;-><init>(II)V

    return-void
.end method


# virtual methods
.method public abstract a(LW/e;LV/g;LV/k1;LV/Y0;)V
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LW/d;->a:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    invoke-interface {v0}, LF7/c;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LW/d;->b:I

    return v0
.end method

.method public e(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IntParameter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ObjectParameter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LW/d;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
