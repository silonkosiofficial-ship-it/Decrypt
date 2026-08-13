.class final LH/L$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/L$b;->a(LN/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/L$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/L$b$a;

    invoke-direct {v0}, LH/L$b$a;-><init>()V

    sput-object v0, LH/L$b$a;->D:LH/L$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/E;)V
    .locals 0

    invoke-virtual {p1}, LN/b;->A()LN/b;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/E;

    invoke-virtual {p0, p1}, LH/L$b$a;->a(LN/E;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
