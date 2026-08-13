.class final LJ7/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LE7/i;

.field private final b:[Ljava/util/List;

.field private final c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(LE7/i;[Ljava/util/List;Ljava/lang/reflect/Method;)V
    .locals 1

    const-string v0, "argumentRange"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unboxParameters"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/j$a;->a:LE7/i;

    iput-object p2, p0, LJ7/j$a;->b:[Ljava/util/List;

    iput-object p3, p0, LJ7/j$a;->c:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final a()LE7/i;
    .locals 1

    iget-object v0, p0, LJ7/j$a;->a:LE7/i;

    return-object v0
.end method

.method public final b()Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, LJ7/j$a;->c:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public final c()[Ljava/util/List;
    .locals 1

    iget-object v0, p0, LJ7/j$a;->b:[Ljava/util/List;

    return-object v0
.end method
