.class final Lr/b$a;
.super Lr/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic F:Lr/b;


# direct methods
.method public constructor <init>(Lr/b;)V
    .locals 0

    iput-object p1, p0, Lr/b$a;->F:Lr/b;

    invoke-virtual {p1}, Lr/b;->o()I

    move-result p1

    invoke-direct {p0, p1}, Lr/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected b(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/b$a;->F:Lr/b;

    invoke-virtual {v0, p1}, Lr/b;->M(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected c(I)V
    .locals 1

    iget-object v0, p0, Lr/b$a;->F:Lr/b;

    invoke-virtual {v0, p1}, Lr/b;->s(I)Ljava/lang/Object;

    return-void
.end method
