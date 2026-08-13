.class final Lh2/z$i$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z$i$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LY8/j;


# direct methods
.method constructor <init>(LY8/j;)V
    .locals 0

    iput-object p1, p0, Lh2/z$i$b$a;->C:LY8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2}, Lh2/z$i$b$a;->b(Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Li7/M;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lh2/z$i$b$a;->C:LY8/j;

    invoke-interface {p2, p1}, LY8/C;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
