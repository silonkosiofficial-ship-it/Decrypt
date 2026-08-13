.class public final synthetic LO5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/h;


# instance fields
.field public final synthetic a:LO5/e;

.field public final synthetic b:Ll4/l;

.field public final synthetic c:LQ5/f;


# direct methods
.method public synthetic constructor <init>(LO5/e;Ll4/l;LQ5/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO5/b;->a:LO5/e;

    iput-object p2, p0, LO5/b;->b:Ll4/l;

    iput-object p3, p0, LO5/b;->c:LQ5/f;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LO5/b;->a:LO5/e;

    iget-object v1, p0, LO5/b;->b:Ll4/l;

    iget-object v2, p0, LO5/b;->c:LQ5/f;

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/g;

    invoke-static {v0, v1, v2, p1}, LO5/e;->a(LO5/e;Ll4/l;LQ5/f;Lcom/google/firebase/remoteconfig/internal/g;)V

    return-void
.end method
