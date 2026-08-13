.class public abstract Lu0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/h$a;,
        Lu0/h$b;,
        Lu0/h$c;,
        Lu0/h$d;,
        Lu0/h$e;,
        Lu0/h$f;,
        Lu0/h$g;,
        Lu0/h$h;,
        Lu0/h$i;,
        Lu0/h$j;,
        Lu0/h$k;,
        Lu0/h$l;,
        Lu0/h$m;,
        Lu0/h$n;,
        Lu0/h$o;,
        Lu0/h$p;,
        Lu0/h$q;,
        Lu0/h$r;,
        Lu0/h$s;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lu0/h;->a:Z

    iput-boolean p2, p0, Lu0/h;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILy7/k;)V
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

    invoke-direct {p0, p1, p2, p3}, Lu0/h;-><init>(ZZLy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu0/h;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lu0/h;->a:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lu0/h;->b:Z

    return v0
.end method
