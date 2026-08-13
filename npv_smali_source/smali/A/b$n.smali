.class final LA/b$n;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/b;->n(F)LA/b$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LA/b$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/b$n;

    invoke-direct {v0}, LA/b$n;-><init>()V

    sput-object v0, LA/b$n;->D:LA/b$n;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILY0/v;)Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->k()Lh0/c$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1, p2}, Lh0/c$b;->a(IILY0/v;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LY0/v;

    invoke-virtual {p0, p1, p2}, LA/b$n;->a(ILY0/v;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
