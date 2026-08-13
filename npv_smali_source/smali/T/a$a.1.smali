.class final LT/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/a;->a(Landroidx/lifecycle/r;Lx7/l;Lx7/a;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LT/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT/a$a;

    invoke-direct {v0}, LT/a$a;-><init>()V

    sput-object v0, LT/a$a;->D:LT/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/k$a;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/lifecycle/k$a;

    invoke-virtual {p0, p1}, LT/a$a;->a(Landroidx/lifecycle/k$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
