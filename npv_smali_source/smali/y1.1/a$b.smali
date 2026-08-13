.class Ly1/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly1/h$c;

.field final synthetic D:I

.field final synthetic E:Ly1/a;


# direct methods
.method constructor <init>(Ly1/a;Ly1/h$c;I)V
    .locals 0

    iput-object p1, p0, Ly1/a$b;->E:Ly1/a;

    iput-object p2, p0, Ly1/a$b;->C:Ly1/h$c;

    iput p3, p0, Ly1/a$b;->D:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ly1/a$b;->C:Ly1/h$c;

    iget v1, p0, Ly1/a$b;->D:I

    invoke-virtual {v0, v1}, Ly1/h$c;->a(I)V

    return-void
.end method
