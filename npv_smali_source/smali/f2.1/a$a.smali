.class final Lf2/a$a;
.super Lf2/c;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field H:Z

.field final synthetic I:Lf2/a;


# direct methods
.method constructor <init>(Lf2/a;)V
    .locals 0

    iput-object p1, p0, Lf2/a$a;->I:Lf2/a;

    invoke-direct {p0}, Lf2/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf2/a$a;->I:Lf2/a;

    invoke-virtual {v0}, Lf2/a;->E()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected g(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf2/a$a;->I:Lf2/a;

    invoke-virtual {v0, p0, p1}, Lf2/a;->y(Lf2/a$a;Ljava/lang/Object;)V

    return-void
.end method

.method protected h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf2/a$a;->I:Lf2/a;

    invoke-virtual {v0, p0, p1}, Lf2/a;->z(Lf2/a$a;Ljava/lang/Object;)V

    return-void
.end method

.method public run()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf2/a$a;->H:Z

    iget-object v0, p0, Lf2/a$a;->I:Lf2/a;

    invoke-virtual {v0}, Lf2/a;->A()V

    return-void
.end method
