.class LR7/n$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/n$a;-><init>(LR7/n;LE8/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/n;

.field final synthetic D:LR7/n$a;


# direct methods
.method constructor <init>(LR7/n$a;LR7/n;)V
    .locals 0

    iput-object p1, p0, LR7/n$a$b;->D:LR7/n$a;

    iput-object p2, p0, LR7/n$a$b;->C:LR7/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ln8/f;)Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LR7/n$a$b;->D:LR7/n$a;

    invoke-static {v0, p1}, LR7/n$a;->j(LR7/n$a;Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, LR7/n$a$b;->a(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
