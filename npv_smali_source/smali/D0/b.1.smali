.class public abstract LD0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD0/m;

.field private static final b:LD0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD0/m;

    sget-object v1, LD0/b$a;->L:LD0/b$a;

    invoke-direct {v0, v1}, LD0/m;-><init>(Lx7/p;)V

    sput-object v0, LD0/b;->a:LD0/m;

    new-instance v0, LD0/m;

    sget-object v1, LD0/b$b;->L:LD0/b$b;

    invoke-direct {v0, v1}, LD0/m;-><init>(Lx7/p;)V

    sput-object v0, LD0/b;->b:LD0/m;

    return-void
.end method

.method public static final a()LD0/m;
    .locals 1

    sget-object v0, LD0/b;->a:LD0/m;

    return-object v0
.end method

.method public static final b()LD0/m;
    .locals 1

    sget-object v0, LD0/b;->b:LD0/m;

    return-object v0
.end method

.method public static final c(LD0/a;II)I
    .locals 0

    invoke-virtual {p0}, LD0/a;->a()Lx7/p;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
