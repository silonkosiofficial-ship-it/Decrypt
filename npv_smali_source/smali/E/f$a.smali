.class final LE/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/f;->a(LF0/j;Ln0/i;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ln0/i;

.field final synthetic E:LD0/t;


# direct methods
.method constructor <init>(Ln0/i;LD0/t;)V
    .locals 0

    iput-object p1, p0, LE/f$a;->D:Ln0/i;

    iput-object p2, p0, LE/f$a;->E:LD0/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ln0/i;
    .locals 3

    .prologue
    iget-object v0, p0, LE/f$a;->D:Ln0/i;

    if-nez v0, :cond_2

    iget-object v0, p0, LE/f$a;->E:LD0/t;

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LD0/t;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/u;->d(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/n;->c(J)Ln0/i;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :cond_2
    :goto_1
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE/f$a;->a()Ln0/i;

    move-result-object v0

    return-object v0
.end method
