.class Ly1/i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/i$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LB1/a;

.field final synthetic D:Ljava/lang/Object;

.field final synthetic E:Ly1/i$b;


# direct methods
.method constructor <init>(Ly1/i$b;LB1/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Ly1/i$b$a;->E:Ly1/i$b;

    iput-object p2, p0, Ly1/i$b$a;->C:LB1/a;

    iput-object p3, p0, Ly1/i$b$a;->D:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ly1/i$b$a;->C:LB1/a;

    iget-object v1, p0, Ly1/i$b$a;->D:Ljava/lang/Object;

    invoke-interface {v0, v1}, LB1/a;->accept(Ljava/lang/Object;)V

    return-void
.end method
