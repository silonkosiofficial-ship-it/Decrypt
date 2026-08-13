.class final Li9/T$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/T;->i(Li9/o;Li9/S;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Li9/T$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/T$a;

    invoke-direct {v0}, Li9/T$a;-><init>()V

    sput-object v0, Li9/T$a;->D:Li9/T$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o;)V
    .locals 1

    const-string v0, "$this$alternativeParsing"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o;

    invoke-virtual {p0, p1}, Li9/T$a;->a(Li9/o;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
