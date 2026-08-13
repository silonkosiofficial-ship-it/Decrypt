.class final Lm9/r$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/r;->a(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lm9/r;

.field final synthetic E:Ljava/lang/CharSequence;

.field final synthetic F:I

.field final synthetic G:I


# direct methods
.method constructor <init>(Lm9/r;Ljava/lang/CharSequence;II)V
    .locals 0

    iput-object p1, p0, Lm9/r$b;->D:Lm9/r;

    iput-object p2, p0, Lm9/r$b;->E:Ljava/lang/CharSequence;

    iput p3, p0, Lm9/r$b;->F:I

    iput p4, p0, Lm9/r$b;->G:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm9/r$b;->D:Lm9/r;

    invoke-virtual {v1}, Lm9/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm9/r$b;->E:Ljava/lang/CharSequence;

    iget v2, p0, Lm9/r$b;->F:I

    iget v3, p0, Lm9/r$b;->G:I

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, 0x1

    invoke-interface {v1, v2, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm9/r$b;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
