.class final Lg9/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/b;->b(Ll4/l;Ll4/b;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ll4/b;


# direct methods
.method constructor <init>(Ll4/b;)V
    .locals 0

    iput-object p1, p0, Lg9/b$b;->C:Ll4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lg9/b$b;->C:Ll4/b;

    invoke-virtual {p1}, Ll4/b;->a()V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lg9/b$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
