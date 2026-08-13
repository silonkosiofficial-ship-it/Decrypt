.class public final LD/F$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/F$c;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD/F;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LD/F;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LD/F$c$a;->a:LD/F;

    iput-object p2, p0, LD/F$c$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, LD/F$c$a;->a:LD/F;

    invoke-static {v0}, LD/F;->g(LD/F;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, LD/F$c$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method
