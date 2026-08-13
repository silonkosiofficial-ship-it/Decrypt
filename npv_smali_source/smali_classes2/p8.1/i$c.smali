.class public abstract Lp8/i$c;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private D:Lp8/h;

.field private E:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    invoke-static {}, Lp8/h;->g()Lp8/h;

    move-result-object v0

    iput-object v0, p0, Lp8/i$c;->D:Lp8/h;

    return-void
.end method

.method static synthetic n(Lp8/i$c;)Lp8/h;
    .locals 0

    invoke-direct {p0}, Lp8/i$c;->p()Lp8/h;

    move-result-object p0

    return-object p0
.end method

.method private p()Lp8/h;
    .locals 1

    iget-object v0, p0, Lp8/i$c;->D:Lp8/h;

    invoke-virtual {v0}, Lp8/h;->q()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp8/i$c;->E:Z

    iget-object v0, p0, Lp8/i$c;->D:Lp8/h;

    return-object v0
.end method

.method private q()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lp8/i$c;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp8/i$c;->D:Lp8/h;

    invoke-virtual {v0}, Lp8/h;->b()Lp8/h;

    move-result-object v0

    iput-object v0, p0, Lp8/i$c;->D:Lp8/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp8/i$c;->E:Z

    :cond_0
    return-void
.end method


# virtual methods
.method protected final r(Lp8/i$d;)V
    .locals 1

    invoke-direct {p0}, Lp8/i$c;->q()V

    iget-object v0, p0, Lp8/i$c;->D:Lp8/h;

    invoke-static {p1}, Lp8/i$d;->r(Lp8/i$d;)Lp8/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/h;->r(Lp8/h;)V

    return-void
.end method
