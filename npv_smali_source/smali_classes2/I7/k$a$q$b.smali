.class final LI7/k$a$q$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/k$a$q;->a()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LI7/k$a$q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/k$a$q$b;

    invoke-direct {v0}, LI7/k$a$q$b;-><init>()V

    sput-object v0, LI7/k$a$q$b;->D:LI7/k$a$q$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Type;
    .locals 1

    const-class v0, Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/k$a$q$b;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
