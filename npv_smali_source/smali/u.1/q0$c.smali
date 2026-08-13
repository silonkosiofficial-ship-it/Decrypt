.class final Lu/q0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/q0;->f(Lu/l;Lu/e;JLx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lu/q0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/q0$c;

    invoke-direct {v0}, Lu/q0$c;-><init>()V

    sput-object v0, Lu/q0$c;->D:Lu/q0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu/i;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu/i;

    invoke-virtual {p0, p1}, Lu/q0$c;->a(Lu/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
