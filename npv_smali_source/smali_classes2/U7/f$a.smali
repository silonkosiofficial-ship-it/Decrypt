.class public final LU7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU7/f;
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

    invoke-direct {p0}, LU7/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ln8/f;)LU7/f;
    .locals 1

    .prologue
    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LU7/d;->h(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LU7/q;

    check-cast p1, Ljava/lang/Enum;

    invoke-direct {v0, p2, p1}, LU7/q;-><init>(Ln8/f;Ljava/lang/Enum;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/annotation/Annotation;

    if-eqz v0, :cond_1

    new-instance v0, LU7/g;

    check-cast p1, Ljava/lang/annotation/Annotation;

    invoke-direct {v0, p2, p1}, LU7/g;-><init>(Ln8/f;Ljava/lang/annotation/Annotation;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_2

    new-instance v0, LU7/j;

    check-cast p1, [Ljava/lang/Object;

    invoke-direct {v0, p2, p1}, LU7/j;-><init>(Ln8/f;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_3

    new-instance v0, LU7/m;

    check-cast p1, Ljava/lang/Class;

    invoke-direct {v0, p2, p1}, LU7/m;-><init>(Ln8/f;Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    new-instance v0, LU7/s;

    invoke-direct {v0, p2, p1}, LU7/s;-><init>(Ln8/f;Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method
