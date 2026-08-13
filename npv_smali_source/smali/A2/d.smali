.class public final LA2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA2/d$a;,
        LA2/d$b;,
        LA2/d$c;
    }
.end annotation


# static fields
.field public static final J:LA2/d$a;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Ljava/lang/String;

.field private final E:Lz2/e$a;

.field private final F:Z

.field private final G:Z

.field private final H:Li7/n;

.field private I:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA2/d$a;-><init>(Ly7/k;)V

    sput-object v0, LA2/d;->J:LA2/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lz2/e$a;ZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA2/d;->C:Landroid/content/Context;

    iput-object p2, p0, LA2/d;->D:Ljava/lang/String;

    iput-object p3, p0, LA2/d;->E:Lz2/e$a;

    iput-boolean p4, p0, LA2/d;->F:Z

    iput-boolean p5, p0, LA2/d;->G:Z

    new-instance p1, LA2/d$d;

    invoke-direct {p1, p0}, LA2/d$d;-><init>(LA2/d;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LA2/d;->H:Li7/n;

    return-void
.end method

.method public static final synthetic a(LA2/d;)Z
    .locals 0

    iget-boolean p0, p0, LA2/d;->G:Z

    return p0
.end method

.method public static final synthetic f(LA2/d;)Lz2/e$a;
    .locals 0

    iget-object p0, p0, LA2/d;->E:Lz2/e$a;

    return-object p0
.end method

.method public static final synthetic g(LA2/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LA2/d;->C:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic i(LA2/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LA2/d;->D:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic o(LA2/d;)Z
    .locals 0

    iget-boolean p0, p0, LA2/d;->F:Z

    return p0
.end method

.method public static final synthetic r(LA2/d;)Z
    .locals 0

    iget-boolean p0, p0, LA2/d;->I:Z

    return p0
.end method

.method private final s()LA2/d$c;
    .locals 1

    iget-object v0, p0, LA2/d;->H:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA2/d$c;

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    iget-object v0, p0, LA2/d;->H:Li7/n;

    invoke-interface {v0}, Li7/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LA2/d;->s()LA2/d$c;

    move-result-object v0

    invoke-virtual {v0}, LA2/d$c;->close()V

    :cond_0
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LA2/d;->D:Ljava/lang/String;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, LA2/d;->H:Li7/n;

    invoke-interface {v0}, Li7/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LA2/d;->s()LA2/d$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_0
    iput-boolean p1, p0, LA2/d;->I:Z

    return-void
.end method

.method public v0()Lz2/d;
    .locals 2

    invoke-direct {p0}, LA2/d;->s()LA2/d$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LA2/d$c;->g(Z)Lz2/d;

    move-result-object v0

    return-object v0
.end method
