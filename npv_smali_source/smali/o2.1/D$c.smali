.class final Lo2/D$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;->h(Lo2/k;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lo2/D$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo2/D$c;

    invoke-direct {v0}, Lo2/D$c;-><init>()V

    sput-object v0, Lo2/D$c;->D:Lo2/D$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/e;)Ljava/util/Set;
    .locals 3

    .prologue
    const-string v0, "statement"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/Z;->b()Ljava/util/Set;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Ly2/e;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ly2/e;->getLong(I)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lj7/Z;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/e;

    invoke-virtual {p0, p1}, Lo2/D$c;->a(Ly2/e;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
