.class final LY7/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY7/e;-><init>(Le8/a;La8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LY7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LY7/e$a;

    invoke-direct {v0}, LY7/e$a;-><init>()V

    sput-object v0, LY7/e$a;->D:LY7/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 3

    sget-object v0, LY7/c;->a:LY7/c;

    invoke-virtual {v0}, LY7/c;->b()Ln8/f;

    move-result-object v0

    new-instance v1, Lt8/u;

    const-string v2, "Deprecated in Java"

    invoke-direct {v1, v2}, Lt8/u;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-static {v0}, Lj7/S;->e(Li7/u;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY7/e$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
