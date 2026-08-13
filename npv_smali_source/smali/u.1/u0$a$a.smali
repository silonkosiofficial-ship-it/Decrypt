.class final Lu/u0$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/u0$a;->a()Lf0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu/u0$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/u0$a$a;

    invoke-direct {v0}, Lu/u0$a$a;-><init>()V

    sput-object v0, Lu/u0$a$a;->D:Lu/u0$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/a;)V
    .locals 0

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/a;

    invoke-virtual {p0, p1}, Lu/u0$a$a;->a(Lx7/a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
