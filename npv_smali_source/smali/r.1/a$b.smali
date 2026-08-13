.class final Lr/a$b;
.super Lr/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic F:Lr/a;


# direct methods
.method constructor <init>(Lr/a;)V
    .locals 0

    iput-object p1, p0, Lr/a$b;->F:Lr/a;

    invoke-virtual {p1}, Lr/Y;->size()I

    move-result p1

    invoke-direct {p0, p1}, Lr/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected b(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/a$b;->F:Lr/a;

    invoke-virtual {v0, p1}, Lr/Y;->f(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected c(I)V
    .locals 1

    iget-object v0, p0, Lr/a$b;->F:Lr/a;

    invoke-virtual {v0, p1}, Lr/Y;->h(I)Ljava/lang/Object;

    return-void
.end method
