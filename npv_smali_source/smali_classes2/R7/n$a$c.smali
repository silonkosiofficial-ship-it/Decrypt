.class LR7/n$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


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

    iput-object p1, p0, LR7/n$a$c;->D:LR7/n$a;

    iput-object p2, p0, LR7/n$a$c;->C:LR7/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LR7/n$a$c;->D:LR7/n$a;

    invoke-static {v0}, LR7/n$a;->k(LR7/n$a;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/n$a$c;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
