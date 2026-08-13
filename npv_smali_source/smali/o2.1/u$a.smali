.class final Lo2/u$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/u;-><init>(Ljava/lang/String;Lx7/l;ILy7/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lo2/u$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo2/u$a;

    invoke-direct {v0}, Lo2/u$a;-><init>()V

    sput-object v0, Lo2/u$a;->D:Lo2/u$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/e;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/e;

    invoke-virtual {p0, p1}, Lo2/u$a;->a(Ly2/e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
