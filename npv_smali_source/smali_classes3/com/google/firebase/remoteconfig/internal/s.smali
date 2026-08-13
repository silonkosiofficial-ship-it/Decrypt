.class public final synthetic Lcom/google/firebase/remoteconfig/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/t;

.field public final synthetic b:Ll4/l;

.field public final synthetic c:Ll4/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/t;Ll4/l;Ll4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/s;->a:Lcom/google/firebase/remoteconfig/internal/t;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/s;->b:Ll4/l;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/s;->c:Ll4/l;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/s;->a:Lcom/google/firebase/remoteconfig/internal/t;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/s;->b:Ll4/l;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/s;->c:Ll4/l;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/remoteconfig/internal/t;->b(Lcom/google/firebase/remoteconfig/internal/t;Ll4/l;Ll4/l;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
