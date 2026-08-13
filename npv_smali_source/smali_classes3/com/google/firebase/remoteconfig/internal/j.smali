.class public final synthetic Lcom/google/firebase/remoteconfig/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/c;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/m;

.field public final synthetic b:Ll4/l;

.field public final synthetic c:Ll4/l;

.field public final synthetic d:Ljava/util/Date;

.field public final synthetic e:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/m;Ll4/l;Ll4/l;Ljava/util/Date;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/j;->a:Lcom/google/firebase/remoteconfig/internal/m;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/j;->b:Ll4/l;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/j;->c:Ll4/l;

    iput-object p4, p0, Lcom/google/firebase/remoteconfig/internal/j;->d:Ljava/util/Date;

    iput-object p5, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Ll4/l;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->a:Lcom/google/firebase/remoteconfig/internal/m;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/j;->b:Ll4/l;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/j;->c:Ll4/l;

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/internal/j;->d:Ljava/util/Date;

    iget-object v4, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Ljava/util/Map;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/remoteconfig/internal/m;->a(Lcom/google/firebase/remoteconfig/internal/m;Ll4/l;Ll4/l;Ljava/util/Date;Ljava/util/Map;Ll4/l;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
