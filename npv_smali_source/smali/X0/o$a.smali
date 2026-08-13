.class public final LX0/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LX0/o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX0/o$a;

    invoke-direct {v0}, LX0/o$a;-><init>()V

    sput-object v0, LX0/o$a;->a:LX0/o$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo0/n0;F)LX0/o;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    sget-object p1, LX0/o$b;->b:LX0/o$b;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lo0/f2;

    if-eqz v0, :cond_1

    check-cast p1, Lo0/f2;

    invoke-virtual {p1}, Lo0/f2;->b()J

    move-result-wide v0

    invoke-static {v0, v1, p2}, LX0/m;->c(JF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LX0/o$a;->b(J)LX0/o;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lo0/a2;

    if-eqz v0, :cond_2

    new-instance v0, LX0/c;

    check-cast p1, Lo0/a2;

    invoke-direct {v0, p1, p2}, LX0/c;-><init>(Lo0/a2;F)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method

.method public final b(J)LX0/o;
    .locals 2

    .prologue
    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, LX0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LX0/d;-><init>(JLy7/k;)V

    goto :goto_0

    :cond_0
    sget-object v0, LX0/o$b;->b:LX0/o$b;

    :goto_0
    return-object v0
.end method
