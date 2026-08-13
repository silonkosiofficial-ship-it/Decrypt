.class final Lb8/e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/e;-><init>(La8/g;Le8/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/e;


# direct methods
.method constructor <init>(Lb8/e;)V
    .locals 0

    iput-object p1, p0, Lb8/e$b;->D:Lb8/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ln8/c;
    .locals 1

    .prologue
    iget-object v0, p0, Lb8/e$b;->D:Lb8/e;

    invoke-static {v0}, Lb8/e;->f(Lb8/e;)Le8/a;

    move-result-object v0

    invoke-interface {v0}, Le8/a;->c()Ln8/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln8/b;->b()Ln8/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/e$b;->a()Ln8/c;

    move-result-object v0

    return-object v0
.end method
