.class final La9/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e;
.implements Lo7/e;


# instance fields
.field private final C:Lm7/e;

.field private final D:Lm7/i;


# direct methods
.method public constructor <init>(Lm7/e;Lm7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/A;->C:Lm7/e;

    iput-object p2, p0, La9/A;->D:Lm7/i;

    return-void
.end method


# virtual methods
.method public e()Lo7/e;
    .locals 2

    .prologue
    iget-object v0, p0, La9/A;->C:Lm7/e;

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 1

    iget-object v0, p0, La9/A;->D:Lm7/i;

    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, La9/A;->C:Lm7/e;

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    return-void
.end method
