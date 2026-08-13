.class final LL7/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LL7/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL7/e$a;

    invoke-direct {v0}, LL7/e$a;-><init>()V

    sput-object v0, LL7/e$a;->D:LL7/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LL7/e;
    .locals 4

    new-instance v0, LL7/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LL7/e;-><init>(ZILy7/k;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL7/e$a;->a()LL7/e;

    move-result-object v0

    return-object v0
.end method
