.class public abstract LF8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[LF7/k;

.field private static final b:LB7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LF8/j;

    const-string v2, "descriptors"

    invoke-static {v1, v2}, Ly7/P;->d(Ljava/lang/Class;Ljava/lang/String;)LF7/e;

    move-result-object v1

    const-string v2, "annotationsAttribute"

    const-string v3, "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LF8/j;->a:[LF7/k;

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    const-class v1, LF8/i;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LM8/s;->c(LF7/c;)LM8/n;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LF8/j;->b:LB7/c;

    return-void
.end method

.method public static final a(LF8/a0;)LP7/g;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/j;->b(LF8/a0;)LF8/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LF8/i;->e()LP7/g;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, LP7/g;->d:LP7/g$a;

    invoke-virtual {p0}, LP7/g$a;->b()LP7/g;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final b(LF8/a0;)LF8/i;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LF8/j;->b:LB7/c;

    sget-object v1, LF8/j;->a:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, LB7/c;->a(Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/i;

    return-object p0
.end method
