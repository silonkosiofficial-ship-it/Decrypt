.class final Lo2/C$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/C;->a(Lo2/k;Ljava/lang/String;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lo2/C$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo2/C$a;

    invoke-direct {v0}, Lo2/C$a;-><init>()V

    sput-object v0, Lo2/C$a;->D:Lo2/C$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/e;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ly2/e;->p()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/e;

    invoke-virtual {p0, p1}, Lo2/C$a;->a(Ly2/e;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
