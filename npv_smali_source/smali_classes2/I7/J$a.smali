.class final LI7/J$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/J;->b(Ljava/lang/reflect/Method;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LI7/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/J$a;

    invoke-direct {v0}, LI7/J$a;-><init>()V

    sput-object v0, LI7/J$a;->D:LI7/J$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, LU7/d;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p0, p1}, LI7/J$a;->a(Ljava/lang/Class;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
